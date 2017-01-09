package co.tinode.tinodesdk.model;

/**
 * Account creation packet
 */
public class MsgClientAcc<Pu,Pr> {
    private static final String USER_NEW = "new";

    public String id;
    public String user;
    public String scheme;
    public String secret;
    // Use the new account for immediate authentication.
    public Boolean login;
    // Account parameters
    public MetaSetDesc<Pu,Pr> desc;

    public MsgClientAcc(String id, String scheme, String secret, boolean login, MetaSetDesc<Pu, Pr> desc) {
        this.id = id;
        this.user = USER_NEW;
        this.scheme = scheme;
        this.secret = secret;
        this.login = login;
        this.desc = desc;
    }
}
