package br.com.codenation.errordashboard.service.impl;

import br.com.codenation.errordashboard.domain.dao.LogDAO;
import br.com.codenation.errordashboard.domain.dto.LogDTO;
import br.com.codenation.errordashboard.domain.entity.Log;
import br.com.codenation.errordashboard.domain.entity.User;
import br.com.codenation.errordashboard.service.interfaces.LogServiceInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class LogService implements LogServiceInterface {

    @Autowired
    LogDAO logDAO;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    @Transactional
    public LogDTO create(LogDTO logDTO, User user) {

        Log log = modelMapper.map(logDTO, Log.class);
        log = logDAO.save(log);
        return modelMapper.map(log, LogDTO.class);
    }

    @Override
    public Boolean delete(Long id, User user){
        return true;
    }
    @Override
    public Log archive(Long id, User user){
        return null;
    }
}
