package commanchesterdigital;

public enum OrderStatus {
    PENDING("Order is pending"),
    DISPATCHED("Order has been dispatched"),
    DECLINED("Order has been declined"),
    AWAITING_PAYMENT("Order is awaitng payment"),
    PROCESSED("Order has been processed");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
