package teacher;

public class Login {
Login a;
	public boolean verify(String name, String password, String compefence) {
	a.setN(name);
	a.setP(password);
	a.setC(compefence);
	if(a.getN()=="qiao"&&a.getP()=="a1b2c3d4"&&a.getC()=="0")
		// TODO 自动生成的方法存根
	return true; 
	else
	return false;
	}
public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
private String n; String p; String c;
}
