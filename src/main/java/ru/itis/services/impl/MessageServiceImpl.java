package services.impl;

import dao.MessageDao;
import models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.MessageService;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    public MessageServiceImpl(MessageDao messageDao) {
    this.messageDao = messageDao;
   }

    @Override
    public Message find(int id) {
        return messageDao.find(id);
    }

    @Override
    public int save(Message model) {
        return messageDao.save(model);
    }

    @Override
    public void update(Message model) {
        messageDao.update(model);
    }

    @Override
    public void delete(int id) {
        messageDao.delete(id);
    }

    @Override
    public List<Message> findAll() {
        return messageDao.findAll();
    }

    @Override
    public List<Message> findAllByChatId(int id) {
        return messageDao.findAllByChatId(id);
    }
}