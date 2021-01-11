package Mobile_Banking_system_phase_2;

public class Bank {
    public String anika_pin="2345";
    public String afrin_pin="";
    public String tamim_pin="2453";
    public String horizontal_line="-------------------------------------------------";

    public void startBanking() {
        Nagad anika = new Nagad("Anika Ahmed", "01712345678","6", anika_pin);
        Bkash afrin = new Bkash("Afrin Islam", "01777888999");
        Rocket tamim = new Rocket("Tamim Rahman", "01688996655", tamim_pin);

      System.out.println("Nagad:");
      anika.add_money(20000);

      anika.cash_out_amount(20000);
      anika.cash_out_pin(anika_pin);
      anika.cash_out_amount(2000);
      anika.cash_out_pin(anika_pin);
      System.out.println(anika);
      System.out.println(horizontal_line);

      System.out.println("Bkash:");
      afrin.add_money(40000);
      afrin.add_money(5000);

      afrin.cash_out_amount(2000);
      afrin_pin= afrin.getPin_number();
      afrin.cash_out_pin(afrin_pin);
      System.out.println(afrin);
      System.out.println(horizontal_line);

      System.out.println("Rocket:");
      tamim.add_money(10000);
      tamim.cash_out_amount(40000);
      tamim.cash_out_pin(tamim_pin);
      tamim.cash_out_amount(5000);
      tamim.cash_out_pin("6783");
      tamim_pin=tamim.get_pin_updated("6783","3467");
      tamim_pin=tamim.get_pin_updated(tamim_pin,"3467");

      tamim.cash_out_amount(3000);
      tamim.cash_out_pin(tamim_pin);
      System.out.println(tamim);


    }
}
