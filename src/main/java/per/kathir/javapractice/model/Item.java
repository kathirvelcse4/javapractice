package per.kathir.javapractice.model;

import lombok.Data;

@Data
public class Item {
  
  private String itemName;
  private long itemId;
  private String color;
  private int price;
  private String category;
  private long accountId;
  private String currency;

}
