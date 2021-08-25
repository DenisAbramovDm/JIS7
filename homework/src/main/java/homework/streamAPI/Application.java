package homework.streamAPI;

import homework.streamAPI.model.Product;
import homework.streamAPI.model.User;
import homework.streamAPI.model.UserStatus;
import homework.streamAPI.service.UserService;
import lombok.extern.log4j.Log4j;

import java.util.Comparator;
import java.util.List;

import static homework.streamAPI.service.ProductService.*;
@Log4j
public class Application {
    public static void main(String[] args) {
      /*  List<Product> products = List.of(
                new Product("Milk", 2.5, 10),
                new Product("Bread", 3, 5),
                new Product("Hamon", 80, 20),
                new Product("Meat", 13, 32),
                new Product("Cucumber", 2.7, 40),
                new Product("Potato", 2.89, 32),
                new Product("Eggs", 3.4, 40),
                new Product("Apple Juice", 3, 0),
                new Product("Maple", 48, 0),
                new Product("Salmon", 53, 0),
                new Product("Sibas", 33, 0),
                new Product("Chicken", 9.2, 0));
        findProductWithDiscount(products);
        findTheMostExpensiveProductWithoutDiscount(products);
        findTheCheapestProductWithTheHighestDiscount(products);
        improvedSorting(products);*/

        List<User> users = List.of(
                new User("petya", "ivanich", 14, "sdfsdf@emai.l", "123", UserStatus.GUEST),
                new User("ilya", "ivanich", 18, "sdfsdf@emai.l", "123", UserStatus.GUEST),
                new User("semen", "ivanich", 16, "sdfsdf@emai.l", "123", UserStatus.GUEST),
                new User("valera", "ivanich", 33, "sdfsdf@emai.l", "123", UserStatus.GUEST),
                new User("inokentiy", "mihalich", 44, "shjg@emai.l", "3456437", UserStatus.VIP_USER),
                new User("ivan", "ivanov", 23, "sdghd@emai.l", "b435gbr", UserStatus.USER),
                new User("dima", "petrov", 54, "jmgfhsd@emai.l", "45hdfhg", UserStatus.GUEST),
                new User("maxim", "sidorov", 45, "awlkjf@emai.l", "5466j5y", UserStatus.USER),
                new User("danila", "vasin", 27, "pwoekfjmds@emai.l", "56utrhsr7", UserStatus.VIP_USER),
                new User("denis", "masin", 37, "sldflksajdfh@emai.l", "re6thr6yrehg5r6y", UserStatus.GUEST),
                new User("mustafa", "petin", 36, "lsdikfjg@emai.l", "45t4yh56776h", UserStatus.GUEST)
        );

        UserService.sortUsers(users);
    }
}
