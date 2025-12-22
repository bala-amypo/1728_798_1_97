@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Digital SerApplication is running";
    }
}
