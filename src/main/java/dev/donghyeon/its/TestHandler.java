package dev.donghyeon.its;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TestHandler extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }

    @Override
    public String getBotUsername() {
        return "its_d_bot";
    }

    @Override
    public String getBotToken() {
        return "1255003327:AAGe6lpCPS6fcK4WTRZf5oN58J0qUYYANJk";
    }
}
