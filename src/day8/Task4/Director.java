package day8.Task4;

public class Director extends Employee{
    private String assistantName;

    public int getDecMoney(int day){
        int salays=0;
        if(day <= 3){
            super.setSalay(super.getSalay()-50*day);
            salays = (int)super.getSalay()-50*day;
        }else{
            super.setSalay(super.getSalay()-80*day);
            salays = (int)super.getSalay()-80*day;
        }
        return salays;
    }

    public Director() {
    }

    public Director(String assistantName) {
        this.assistantName = assistantName;
    }

    public Director(int id, String sex, String name, String duty, double salay, int holidays, String assistantName) {
        super(id, sex, name, duty, salay, holidays);
        this.assistantName = assistantName;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    @Override
    public String toString() {
        return "Director{" +
                "assistantName='" + assistantName + '\'' +
                "} " + super.toString();
    }
}
