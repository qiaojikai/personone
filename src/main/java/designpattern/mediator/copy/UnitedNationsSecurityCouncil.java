package designpattern.mediator.copy;

class UnitedNationsSecurityCouncil extends UnitedNations {

    /**
     * 安理会在中间作出调停
     *
     * @param country
     * @param msg
     */
    @Override
    protected void declare(Country country, String msg) {
        for (Country toCountry : countries) {
            if (!toCountry.equals(country)) {
                String name = country.getName();
                toCountry.receive(name + "平和的说: " + msg);
            }
        }
    }
}