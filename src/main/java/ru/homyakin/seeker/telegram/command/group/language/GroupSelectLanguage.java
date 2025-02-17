package ru.homyakin.seeker.telegram.command.group.language;

import ru.homyakin.seeker.infrastructure.TextConstants;
import ru.homyakin.seeker.telegram.command.Command;

public record GroupSelectLanguage(
    String callbackId,
    Long groupId,
    Integer messageId,
    Long userId,
    String data
) implements Command {
    public Integer getLanguageId() {
        return Integer.valueOf(data.split(TextConstants.CALLBACK_DELIMITER)[1]);
    }
}
