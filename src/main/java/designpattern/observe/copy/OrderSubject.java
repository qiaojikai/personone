package designpattern.observe.copy;


class OrderSubject extends Subject {

    private String state;

    /**
     * 采用拉模型, 将Subject自身发送给Observer
     */
    @Override
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
}
