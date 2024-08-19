import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Employee [] persArray = new Employee[5];
            persArray[0] = new Employee ("Денис Юрьевич Касьянов", "Директор по развитию", "kas@impulse.ru", "79139335533", 120000, 33);
            persArray[1] = new Employee ("Ксения Андреевна Сазонова", "BTL-менеджер", "sazonova@impulse.ru", "79130030055", 35000, 27);
            persArray[2] = new Employee ("Ксения Алексеевна Попова", "BTL-менеджер", "popik@impulse.ru", "79232200757", 35000, 26);
            persArray[3] = new Employee ("Глеб Романович Свистунов", "Дизайнер", "designer@impulse.ru", "79833330502", 45000, 31);
            persArray[4] = new Employee ("Анна Николаевна Алексеева", "Менеджер", "manager@impulse.ru", "79232526262", 30000, 27);
        for (Employee employee : persArray) {
            employee.printInfo();
        }

    }

}
