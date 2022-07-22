package DTO;

public class line_itemsListDto {

    private int id;
    private String name;
    private String product_id;
    private String quantity;
    private String total;
  
//   @Override
//   public String toString(){
//        return "id : "+id+"\nname"+name+"\nproductid : "+product_id+"\nquantity : "+quantity+"\ntotal : "+total+","+",\n";   
//   }

//    final ObjectMapper objectMapper = new ObjectMapper();
//    List<Language> langList = objectMapper.readValue(
//            new File("langs.json"),
//            new TypeReference<List<Language>>() {
//            });
//
//    langList.forEach (x -> System.out.println(x.toString()));

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getQuanity() {
        return quantity;
    }

    public void setQuanity(String quanity) {
        this.quantity = quanity;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
  
   
   
   
}
