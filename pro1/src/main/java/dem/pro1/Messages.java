package dem.pro1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Messages implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer messageCode;
   private java.lang.String message;

   public Messages()
   {
   }

   public java.lang.Integer getMessageCode()
   {
      return this.messageCode;
   }

   public void setMessageCode(java.lang.Integer messageCode)
   {
      this.messageCode = messageCode;
   }

   public java.lang.String getMessage()
   {
      return this.message;
   }

   public void setMessage(java.lang.String message)
   {
      this.message = message;
   }

   public Messages(java.lang.Integer messageCode, java.lang.String message)
   {
      this.messageCode = messageCode;
      this.message = message;
   }

}