package homework.streamAPI.service;

import homework.streamAPI.model.User;
import homework.streamAPI.model.UserStatus;
import lombok.extern.log4j.Log4j;

import java.util.List;
import java.util.stream.Collectors;

@Log4j
public class UserService {
    private static void validateUser(User user) {
        if (user.getAge() < 18) {
            user.setActive(false);
            user.setStatus(UserStatus.GUEST);
        }
    }

    public static void sortUsers(List<User> users) {

        users.stream()
                .sorted((o1, o2) -> {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                })
                .peek(UserService::validateUser)
                .filter(user -> user.getAge() >= 18)
                .map(User::toString)
                .forEach(log::info);


    }

}
/*
    Написать метод который сортируетюзеров по нику и отфильтровывает чтобы в этой коллекции были юзеры старше 18 лет,
    если младше то тем юзерам флаг меняется на isActive false и статус переходит в guest.

    Написать метод который выводит количество юзеров со статусом USER и флагом true

    Написать методы которые проходят по коллекции юзеров в стриме и если юзеры имеют статус guest, то засетать им статус USER
    и перевести флаг isActive в true, а если уже был USER и isActive то перевести в VIP USER.
 */