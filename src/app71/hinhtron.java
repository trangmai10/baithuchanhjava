package app71;

public class hinhtron {
    private final float pi=3.14f;
    private float banKinh;

    public float getBanKinh(){
        return banKinh;
    }
    public void setBanKinh(float banKinh){
       this.banKinh=banKinh;
    }
    public float tinhChuVi(){
        return banKinh*pi*2;
    }
    public float tinhDienTich(){
        return banKinh*banKinh*pi;
    }
}

