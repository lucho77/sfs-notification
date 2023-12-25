package sfs.notification.repository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class HomeRepositoryImpl implements IHomeRepository{

	@Override
	public String pingService() {
		return "Hello Ping from Service";
	}

}
