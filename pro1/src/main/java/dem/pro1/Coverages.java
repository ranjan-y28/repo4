package dem.pro1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Coverages implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String coverageName;
   private java.lang.Double coverageRate;
   private java.lang.Double coverageAmount;

   public Coverages()
   {
   }

   public java.lang.String getCoverageName()
   {
      return this.coverageName;
   }

   public void setCoverageName(java.lang.String coverageName)
   {
      this.coverageName = coverageName;
   }

   public java.lang.Double getCoverageRate()
   {
      return this.coverageRate;
   }

   public void setCoverageRate(java.lang.Double coverageRate)
   {
      this.coverageRate = coverageRate;
   }

   public java.lang.Double getCoverageAmount()
   {
      return this.coverageAmount;
   }

   public void setCoverageAmount(java.lang.Double coverageAmount)
   {
      this.coverageAmount = coverageAmount;
   }

   public Coverages(java.lang.String coverageName,
         java.lang.Double coverageRate, java.lang.Double coverageAmount)
   {
      this.coverageName = coverageName;
      this.coverageRate = coverageRate;
      this.coverageAmount = coverageAmount;
   }

}