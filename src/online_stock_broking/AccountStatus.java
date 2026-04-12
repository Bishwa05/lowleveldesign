package online_stock_broking;

public enum ReturnStatus {
    SUCCESS, FAIL, INSUFFICIENT_FUNDS, INSUFFICIENT_QUANTITY, NO_STOCK_POSITION
}

public enum OrderStatus {
    OPEN, FILLED, PARTIALLY_FILLED, CANCELLED
}

public enum TimeEnforcementType {
    GOOD_TILL_CANCELLED, FILL_OR_KILL, IMMEDIATE_OR_CANCEL, ON_THE_OPEN, ON_THE_CLOSE
}

public enum AccountStatus {
    ACTIVE, CLOSED, CANCELED, BLACKLISTED, None
}

public static class Constants {
    public static final int MONEY_TRANSFER_LIMIT = 100_000;
}