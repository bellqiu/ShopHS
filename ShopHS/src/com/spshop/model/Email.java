package com.spshop.model;

public class Email extends Component {
    
    /**
     *
     */
    private static final long serialVersionUID = 2451032001983675357L;
    
    private String emailAddress;
    
    public Email(){
        
    }
    
    public Email(Email e){
        super(e);
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @autogenerated by CodeHaggis (http://sourceforge.net/projects/haggis)
     * clone
     * @return Object
     */
    public Email clone() {
        Email obj = null;
        obj = new Email(this);
        if (this.emailAddress != null) {
            /* Does not have a clone() method */
            obj.emailAddress = this.emailAddress;
        }
        return obj;
    }

}
