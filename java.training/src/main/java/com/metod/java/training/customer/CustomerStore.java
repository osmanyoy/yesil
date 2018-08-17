package com.metod.java.training.customer;

public class CustomerStore {
    private int customer1MaxCount;
    private int customer2MaxCount;
    private int customer3MaxCount;

    private CustomerStore() {
    }

    public static CustomerStoreBuilder getBuilder() {
        return new CustomerStoreBuilder();
    }

    public static class CustomerStoreBuilder {
        private static final int CUTOMER_STORE_1_LIMIT_CUSTOMER1 = 10;
        private static final int CUTOMER_STORE_1_LIMIT_CUSTOMER2 = 10;
        private static final int CUTOMER_STORE_1_LIMIT_CUSTOMER3 = 20;
        private CustomerStore customerStore;

        private CustomerStoreBuilder() {
            this.customerStore = new CustomerStore();
        }

        public CustomerStoreBuilder withCustomer1MaxCount(final int customer1MaxCount) {
            this.customerStore.customer1MaxCount = customer1MaxCount;
            return this;
        }

        public CustomerStoreBuilder withCustomer2MaxCount(final int customer2MaxCount) {
            this.customerStore.customer2MaxCount = customer2MaxCount;
            return this;
        }

        public CustomerStoreBuilder withCustomer3MaxCount(final int customer3MaxCount) {
            this.customerStore.customer3MaxCount = customer3MaxCount;
            return this;
        }

        public CustomerStore buildCustomerStore1Type() throws CustomerStoreCreateException {
            this.validate(ECustomerStoreType.TYPE1);
            return this.customerStore;
        }

        private void validate(final ECustomerStoreType type) throws CustomerStoreCreateException {
            if (this.customerStore.customer1MaxCount > type.getCustomer1Limit()) {
                throw new CustomerStoreCreateException("Customer store type 1 can get max " + type.getCustomer1Limit()
                        + " customer1");
            }
            if (this.customerStore.customer2MaxCount > type.getCustomer2Limit()) {
                throw new CustomerStoreCreateException("Customer store type 1 can get max " + type.getCustomer2Limit()
                        + " customer2");
            }
            if (this.customerStore.customer3MaxCount > type.getCustomer3Limit()) {
                throw new CustomerStoreCreateException("Customer store type 1 can get max " + type.getCustomer3Limit()
                        + " customer3");
            }

        }

        public CustomerStore buildCustomerStore2Type() throws CustomerStoreCreateException {
            this.validate(ECustomerStoreType.TYPE2);
            return this.customerStore;
        }

        public CustomerStore buildCustomerStore3Type() throws CustomerStoreCreateException {
            this.validate(ECustomerStoreType.TYPE3);
            return this.customerStore;
        }
    }
}
