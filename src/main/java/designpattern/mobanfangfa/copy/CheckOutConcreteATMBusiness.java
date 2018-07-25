package designpattern.mobanfangfa.copy;

class CheckOutConcreteATMBusiness extends AbstractATMBusiness {

    @Override
    protected void onBusiness() {
        System.out.println(" ... 取款");
    }
}

class ChangePasswordConcreteATMBusiness extends AbstractATMBusiness {

    @Override
    protected void onBusiness() {
        System.out.println(" ... 修改密码");
    }
}
