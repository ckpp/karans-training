package example.facade.membership.impl;

import java.util.List;

import example.facade.membership.FacadeUser;
import example.facade.membership.MembershipManager;

public class MembershipManagerImpl implements MembershipManager {

	@Override
	public void addUser(FacadeUser user) {
		// TODO Auto-generated method stub
	}

	@Override
	public FacadeUser getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<FacadeUser> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void activateUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diableUser(String username) {
		// TODO Auto-generated method stub
		
	}
}
