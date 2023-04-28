package sfs.notification.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import sfs.notification.repository.IHomeRepository;
@ApplicationScoped

public class HomeServiceImpl implements IHomeService{
	@Inject
	IHomeRepository homeRepository;

	
	@Override
	public String pingService() {
		return homeRepository.pingService();
	}

}
