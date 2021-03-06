package com.gatehill.corebot.chat.model.template

import com.gatehill.corebot.chat.model.action.ActionType
import com.gatehill.corebot.config.ConfigService
import java.util.*
import javax.inject.Inject

/**
 * Locks an option value.
 */
class LockOptionTemplate @Inject constructor(configService: ConfigService) : BaseLockOptionTemplate(configService) {
    override val actionType: ActionType = ActionType.LOCK_OPTION
    override val tokens = LinkedList(listOf("lock", "{${optionNamePlaceholder}}", "{${optionValuePlaceholder}}"))
}