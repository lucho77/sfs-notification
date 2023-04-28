package sfs.notification.repository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class HomeRepositoryImpl implements IHomeRepository{

	@Override
	public String pingService() {
		return "Hello Ping from Service";
	}

}
