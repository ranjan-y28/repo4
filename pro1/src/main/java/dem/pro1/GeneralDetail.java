package dem.pro1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GeneralDetail implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;
   private java.lang.Integer age;

   private java.lang.String sex;

   private java.lang.Double sumInsured;

   public GeneralDetail()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.lang.String getSex()
   {
      return this.sex;
   }

   public void setSex(java.lang.String sex)
   {
      this.sex = sex;
   }

   public java.lang.Double getSumInsured()
   {
      return this.sumInsured;
   }

   public void setSumInsured(java.lang.Double sumInsured)
   {
      this.sumInsured = sumInsured;
   }

   public GeneralDetail(java.lang.String name, java.lang.Integer age,
         java.lang.String sex, java.lang.Double sumInsured)
   {
      this.name = name;
      this.age = age;
      this.sex = sex;
      this.sumInsured = sumInsured;
   }

}