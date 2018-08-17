package com.metod.java.training.projects.customer.commands;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.metod.java.training.projects.customer.dao.Account;
import com.metod.java.training.projects.customer.dao.Customer;
import com.metod.java.training.projects.customer.dao.EAccountType;

public class DepositDOLARCommandTest {

    private Customer customer;
    private Account dolarAccount;
    private Account tlAccount;

    @Before
    public void init() {
        this.customer = new Customer("osman",
                                     "yay",
                                     "osman",
                                     "1234");
        this.dolarAccount = new Account();
        this.dolarAccount.setAccountType(EAccountType.DOLAR);
        this.dolarAccount.setAmount(1000);
        this.dolarAccount.setDescription("saddsa");

        this.tlAccount = new Account();
        this.tlAccount.setAccountType(EAccountType.TL);
        this.tlAccount.setAmount(1000);
        this.tlAccount.setDescription("saddsa");

        this.customer.addAccount(this.dolarAccount);

    }

    @Test
    public void testExecute1() {
        InputStream targetStream = new ByteArrayInputStream("100".getBytes());
        Scanner scanner = new Scanner(targetStream);

        DepositDOLARCommand depositDOLARCommand = new DepositDOLARCommand();
        depositDOLARCommand.execute(scanner, this.customer);

        Assert.assertEquals(1100, this.dolarAccount.getAmount(), 0);
    }

    @Test
    public void testExecute2() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextDouble())
               .thenReturn(100D);

        DepositDOLARCommand depositDOLARCommand = new DepositDOLARCommand();
        depositDOLARCommand.execute(mockScanner, this.customer);

        Assert.assertEquals(1100, this.dolarAccount.getAmount(), 0);

    }

    @Test
    public void test_WithdrawnDOLARCommand_execute() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextDouble())
               .thenReturn(100D);

        WithdrawnDOLARCommand command = new WithdrawnDOLARCommand();
        command.execute(mockScanner, this.customer);

        Assert.assertEquals(900, this.dolarAccount.getAmount(), 0);

    }

    @Test
    public void test_WithdrawnTLCommand_execute() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextDouble())
               .thenReturn(100D);

        WithdrawnTLCommand command = new WithdrawnTLCommand();
        command.execute(mockScanner, this.customer);

        Assert.assertEquals(900, this.tlAccount.getAmount(), 0);

    }

}
