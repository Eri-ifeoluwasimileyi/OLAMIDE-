package BankApp;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBankApp {


         @Test
         public void testTestAccountCanDeposit() {
            Account olaAccount = new Account("correctPin");
            assertEquals(0, olaAccount.getBalance("correctPin"));

        }

        @Test
        public void testTestAccountDepositDoesNotChange() {
            Account olaAccount = new Account("correctPin");
            olaAccount.deposit(-2_000);
            assertEquals(0, olaAccount.getBalance("correctPin"));
        }

        @Test
        public void testTestAccountCanIncreaseFrom2k_To4k() {
            Account olaAccount = new Account("correctPin");
            olaAccount.deposit(2_000);
            assertEquals(2_000, olaAccount.getBalance("correctPin"));

            olaAccount.deposit(2_000);
            assertEquals(4_000, olaAccount.getBalance("correctPin"));
        }

        @Test
        public void testThatAccountCanWithdraw() {
            Account olaAccount = new Account("correctPin");
            olaAccount.deposit(4_000);
            olaAccount.withdraw(2_000);
            assertEquals(2_000, olaAccount.getBalance("correctPin"));

        }

        @Test
        public void testThatAccountCannotWithdrawMoreThanBalance() {
            Account olaAccount = new Account("correctPin");
            olaAccount.deposit(2_000);
            assertFalse(olaAccount.withdraw(3_000));
            assertEquals(2_000, olaAccount.getBalance("correctPin"));

        }

        @Test
        public void testThatAccountCannotWithdrawAmount() {
            Account olaAccount = new Account("correctPin");
            assertFalse(olaAccount.withdraw(-2_000));

        }

        @Test
        public void testThatAccountPinIsCorrect() {
            Account olaAccount = new Account("correctPin");
            assertTrue(olaAccount.isPinCorrect("correctPin"));
        }

        @Test
        public void testGetBalanceReturnsInvalidWithWrongPin() {
            Account olaAccount = new Account("wrongPin");
            assertFalse(olaAccount.isPinCorrect("correctPin"));

        }

        @Test
        public void testGetBalanceReturnsInValidWithInCorrectPin() {
            Account olaAccount = new Account("");
            assertFalse(olaAccount.isPinCorrect("wrongPin"));
        }

    }

