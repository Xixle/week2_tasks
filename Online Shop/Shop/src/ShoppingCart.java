package com.company;

public class ShoppingCart {
    private int cartId;
    private String productId;
    private int quantity;
    private String creditCartInfo;

    public ShoppingCart(int cartId, String productId, int quantity, String creditCartInfo) {
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
        this.creditCartInfo = creditCartInfo;
    }



    public int getCartId(){
        return cartId;
    }
    public void setCardIt(int cartId){
        this.cartId = cartId;
    }
    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public String getCreditCardInfo(){
        return creditCartInfo;
    }
    public void setCreditCardInfo(String creditCartInfo){
        this.creditCartInfo = creditCartInfo;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", creditCartInfo=" + creditCartInfo +
                '}';
    }
}
