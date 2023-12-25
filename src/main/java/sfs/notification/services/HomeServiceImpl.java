package sfs.notification.services;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
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
