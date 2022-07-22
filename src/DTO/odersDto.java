package DTO;

import java.util.List;

public class odersDto {

    private int id;
    private String currency;
    private String date_modified;
    private double total;
    private int customer_id;
    private String order_key;
    
    private billingListDto billing;
    
    private String payment_method;
    private String transaction_id;
    private String customer_note;
    
    private List<line_itemsListDto> line_items;
 //   private List<line_items_list> line_items_list;
//    private line_itemsListDto line_items;

    

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate_modified() {
         return date_modified = date_modified.split("T")[0];
    }

    public void setDate_modified(String date_modified) {
        //2021-08-29T15:45:52
       this.date_modified =  date_modified.split("T")[0];
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getOrder_key() {
        return order_key;
    }

    public void setOrder_key(String order_key) {
        this.order_key = order_key;
    }

    public billingListDto getBilling() {
        return billing;
    }

    public void setBilling(billingListDto billing) {
        this.billing = billing;
    }
    
    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getCustomer_note() {
        return customer_note;
    }

    public void setCustomer_note(String customer_note) {
        this.customer_note = customer_note;
    }

    public List<line_itemsListDto> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<line_itemsListDto> line_items) {
        this.line_items = line_items;
    }

//    public line_itemsListDto getLine_items() {
//        return line_items;
//    }
//
//    public void setLine_items(line_itemsListDto line_items) {
//        this.line_items = line_items;
//    }
  


}
