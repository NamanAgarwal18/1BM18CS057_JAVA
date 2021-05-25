import java.util.ArrayList;

public class MobilePhones {
    private ArrayList<Mobile> array;

    public MobilePhones() {
        this.array = new ArrayList<Mobile>();
    }

    public void print()
    {
        for (int i = 0; i < array.size(); i++) {
            System.out.println((i+1) + " Name: " + array.get(i).getName() + "\n  Number: " + array.get(i).getNumber());
        }
    }

    public void addnew(long number, String name)
    {
        Mobile temp = new Mobile(number,name);
        array.add(temp);
    }

    private int locate(String name) {
        for (int i = 0; i < array.size(); i++) {
            if (name.equals(array.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeOld(String name)
    {
        int temp = locate(name);
        if(temp<0)
        {
            System.out.println("Entry Not Found");
            return false;
        }
        array.remove(temp);
        return true;
    }

    public boolean modify (String oldName, String newName)
    {
        int temp = locate(oldName);
        if(temp<0)
        {
            System.out.println("Entry Not Found");
            return false;
        }
        array.get(temp).setName(newName);
        return true;
    }

    public boolean modify(String oldName, long number)
    {
        int temp = locate(oldName);
        if(temp<0)
        {
            System.out.println("Entry Not Found");
            return false;
        }
        array.get(temp).setNumber(number);
        return true;
    }
}
