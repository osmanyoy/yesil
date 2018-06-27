package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private EMployeeDAO           empDAO;

    @Value("${system.admin.username}")
    private String                adminUsername;

    @Value("${system.admin.password}")
    private String                adminPassword;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public MyUserDetailService() {
    }

    @Override
    public UserDetails loadUserByUsername(final String usernameParam) throws UsernameNotFoundException {
        if (usernameParam.equals(this.adminUsername)) {
            return User.builder()
                       .username(this.adminUsername)
                       .password(this.bCryptPasswordEncoder.encode(this.adminPassword))
                       .roles("ADMIN")
                       .build();

        }
        Employee findByUsernameLoc = this.empDAO.findByUsername(usernameParam);
        if (findByUsernameLoc == null) {
            throw new UsernameNotFoundException("User yok");
        }
        return User.builder()
                   .username(findByUsernameLoc.getUsername())
                   .password(this.bCryptPasswordEncoder.encode(findByUsernameLoc.getPassword()))
                   .roles(findByUsernameLoc.getEmployeeType()
                                           .toString())
                   .build();
    }


}
