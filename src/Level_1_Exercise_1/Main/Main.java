package Level_1_Exercise_1.Main;
import Level_1_Exercise_1.Modules.OnSiteWorker;
import Level_1_Exercise_1.Modules.WorkerOnline;

public class Main {
    public static void main(String[] args) {
        WorkerOnline workerOnline=new WorkerOnline("Pepe","Lopez",15);
        OnSiteWorker onSiteWorker=new OnSiteWorker("Antonio","Perez",15);
        System.out.println("Pepe's salary is "+workerOnline.calculateSalary(22));
        System.out.println("Antonio's salary is "+onSiteWorker.calculateSalary(16));
    }
}