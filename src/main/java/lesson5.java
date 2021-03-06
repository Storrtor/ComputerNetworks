public class lesson5 {
    /**
     * L4 - транспортный уровень
     *
     * Например, UDP и TCP (от кого/кому это адрес - порт sourse/порт dst)
     * каждый порт 16 бит инфы
     * диапазон портов 2^16 (65 025);
     * Порт sourse - берется рандомно, а порт dst - зарезервированы и выбираются (Например для веба, 80)
     * ssh - 22 порт, mail 25, dns - 53 и тд
     *
     * Протокол UDP (может потерять пакет, ненадежный)
     * - порт сорс
     * - порт дистан
     * - длина пакета
     * - чек сам (целостность пакета)
     * Используется для показа видео, звука, ip-телефония (zoom через udp например)))
     * Если L5 c DHCP, то будет гарантия надежности доставки (к UDP)
     *
     * Протокол TCP (гарантирована доставялется)
     * Принцип действия:
     * открывается tcp-сессия (tcp - hand - shake) - 3х сторонее рукопожатие:
     * 1) от клиента отправляется пакет со специальным плагом SYN
     * 2) сервер (не шлет никогда SYN первым, только обслуживает) приняв SYN пакет в обратку отправялет SYN/ACK - пакет с подтверждением
     * 3) отправляется от клиента на сервер ACK пакет с потверждением получения ответа от сервера
     * 4) установилось соединение и пошел обмен данными
     *
     * Гарантия дотсавки:
     * SEQ number - число от 1 до 4млрд (30 бита)
     * Это число с каждым разом растет на кол-во отправленных байт
     * На приемнике:
     * ACK number (30 bit)
     * Сколько отправляем, столько байт в ACK увеличили на принимаемом устройстве
     * С каждой отправки пакета идет сверяние кол-во отправленных и принятых байт)
     *
     * Для ускорнения TCP с каждым разом увеличивается кол-во пакетом, если ACK - ок, то наращиваем дальше
     * SAC - Selective Ac - лучше польховаться им, если есть возможность в приложении управлять
     *
     * программа для отслеживания трафика Wireshark
     * Панель удобная
     * File preferenses - layout - и тд
     *
     *
     */
}
