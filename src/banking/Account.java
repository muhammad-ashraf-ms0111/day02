package banking;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class Account {
    private String id;
    private String name;
    private double balance;


    public Account(String id, String name, double balance) {
        if (id == null || id.isBlank() || name == null || name.isBlank()) {
            throw new IllegalArgumentException("INVALID PARAMS");
        }
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(Account source) {
        this.id = source.id;
        this.name = source.name;
        this.balance = source.balance;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("INVALID ID");
        }
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("INVALID NAME");
        }
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract Account clone();

    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        return Double.parseDouble(formatter.format(amount));
    }
   

    @Override
    public String toString() {
        return (this.getClass().getSimpleName()) + "    " +
            "\t" + this.getId()+ "" +
            "\t" + this.getName()+ "" +
            "\t$" + this.getBalance() + "";
    }


}





// import java.text.DecimalFormat;

// // private – cannot be accessed outside the class.
// // public – accessible from everywhere.
// // protected – accessible to child classes. Favor protected over public if only the child classes need access to a particular method.

// public abstract class Account {
//   //abstract prohibits from making an object and only purpose is for inheritance
//   private String id;
//   private String name;
//   private double balance;


// public Account(String id, String name, double balance) {
//   if (id == null || id.isBlank() || name == null || name.isBlank())  //QUALITY CONTROL
//       throw new IllegalArgumentException("INVALID PARAMS");
//   this.id = id;
//   this.name = name;
//   this.balance = balance;
//   }

// public abstract void deposit(double amount);
// public abstract boolean withdraw(double amount);
// public abstract Account clone();
// //child force to override

// protected double round(double amount) {
//   DecimalFormat formatter = new DecimalFormat("#.##");
//   return Double.parseDouble(formatter.format(amount));
// } //child classes can access

// public Account(Account source) {
//   this.id = source.id;
//   this.name = source.name;
//   this.balance = source.balance;
//   }


//   @Override
//   public String toString() {
//     return (this.getClass().getSimpleName()) + "    " +
//       "\t'" + getId() + "'" +
//       "\t'" + getName() + "'" +
//       "\t'" + getBalance() + "";
//   }


// public String getId() {
//   return id;
// }

// public void setId(String id) {
//   if (id == null || id.isBlank())  //QUALITY CONTROL
//       throw new IllegalArgumentException("INVALID ID");
//   this.id = id;
// }

// public String getName() {
//   return name;
// }

// public void setName(String name) {
//   if (name == null || name.isBlank())  //QUALITY CONTROL
//       throw new IllegalArgumentException("INVALID NAME");
//   this.name = name;
// }

// public double getBalance() {
//   return balance;
// }

// public void setBalance(double balance) {
//   this.balance = balance;
// }



// }


