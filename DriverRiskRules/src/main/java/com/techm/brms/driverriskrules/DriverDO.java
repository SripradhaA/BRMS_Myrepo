package com.techm.brms.driverriskrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DriverDO implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer age;
   private java.lang.Integer risk;

   public DriverDO()
   {
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.Integer getRisk()
   {
      return this.risk;
   }

   public void setRisk(java.lang.Integer risk)
   {
      this.risk = risk;
   }

   public DriverDO(java.lang.Integer age, java.lang.Integer risk)
   {
      this.age = age;
      this.risk = risk;
   }

}