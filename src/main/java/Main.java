import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    static JDA jda;

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("NzAyNDU2MzIyMTYzMjEyMzAw.XqApPQ.0mjbtTG3Sfy8IHpX9SzHNv5hVzs");
        builder.addEventListeners(new MainListener());
        jda = builder.build();

//        ScheduledThreadPoolExecutor implementation = (ScheduledThreadPoolExecutor) Scheduled_Executor_Service;
//        int size = implementation.getQueue().size();
    }

    //long time = System.currentTimeMillis();
//            channel.sendMessage("Pong!")
//                    .queue(response  -> {
//                        response.editMessageFormat("Pong: %d ms", System.currentTimeMillis() - time).queue();
//                    });
    //channel.sendMessage("Pong!").queue();
}
