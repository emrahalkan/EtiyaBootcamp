package entities.concretes;

public class UserAuthority {
	private int userAuthorityId;
	private User user;
	private Authority authority;

	public UserAuthority() {
	}

	public UserAuthority(int userAuthorityId, User user, Authority authority) {
		this.userAuthorityId = userAuthorityId;
		this.user = user;
		this.authority = authority;
	}

	public int getUserAuthorityId() {
		return userAuthorityId;
	}

	public void setUserAuthorityId(int userAuthorityId) {
		this.userAuthorityId = userAuthorityId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

}
