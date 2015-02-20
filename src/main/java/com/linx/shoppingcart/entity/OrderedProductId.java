// default package
// Generated 25 Aug 2014 8:52:00 PM by Hibernate Tools 3.4.0.CR1
package com.linx.shoppingcart.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Lingani Tshuma - May the source be with you.
 * 
 * OrderedProductId generated by hbm2java
 */
@Embeddable
public class OrderedProductId implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private int customerOrderId;
  private int productId;

  public OrderedProductId() {}

  public OrderedProductId(int customerOrderId, int productId) {
    this.customerOrderId = customerOrderId;
    this.productId = productId;
  }



  @Column(name = "customer_order_id", nullable = false)
  public int getCustomerOrderId() {
    return this.customerOrderId;
  }

  public void setCustomerOrderId(int customerOrderId) {
    this.customerOrderId = customerOrderId;
  }


  @Column(name = "product_id", nullable = false)
  public int getProductId() {
    return this.productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }


  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof OrderedProductId))
      return false;
    OrderedProductId castOther = (OrderedProductId) other;

    return (this.getCustomerOrderId() == castOther.getCustomerOrderId())
        && (this.getProductId() == castOther.getProductId());
  }

  public int hashCode() {
    int result = 17;

    result = 37 * result + this.getCustomerOrderId();
    result = 37 * result + this.getProductId();
    return result;
  }


}