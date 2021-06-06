package day3Homework1InheritanceKodlamaIO;

public class UserManager {
	public void removeUser(User user) {
		System.out.println("Üye kaydi silindi.");
	}
	public void updateUser(User user) {
		System.out.println("Üye kaydi guncellendi.");
	}
	public void list(User[] users) {
		System.out.println("Sistemdeki Kullanicilar");
		System.out.println("User ID First Name");
		for (User user : users) {
			System.out.println(user.getId() + "       " +
					user.getFirstName());			
		}
	}
}
