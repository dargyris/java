public class Handle {
    private String name;
    private Integer id;
    private Integer secret;

    public Handle(String name, Integer id, Integer secret) {
        this.name = name;
        this.id = id;
        this.secret = secret;
    }
    public Integer calculateKey() {
        return id * secret;
    }
}
