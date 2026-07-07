interface Repo{String find();}class RepoImpl implements Repo{public String find(){return "Customer";}}
class Service{Repo r;Service(Repo r){this.r=r;}void show(){System.out.println(r.find());}}
public class Exercise11_DependencyInjection{public static void main(String[]a){new Service(new RepoImpl()).show();}}