1) Фіча:
Цей код запитує користувача обрати тип учасника (1, 2 або 3) та відповідно створює об'єкт вибраного типу для подальшого участі у змаганні. Учасник може бути обраний лише один раз, і програма виведе повідомлення про результати змагання для вибраного учасника.

Інтерфейс Participant було перейменовано на Participants, щоб відобразити, що це інтерфейс для учасників (в множині). Аналогічно, ім'я класу Participant було перейменовано на Participants.

Додано інтерфейси Obstacles для об'єктів-перешкод та перейменовано Obstacle на Obstacles, щоб відображати множинну природу цього інтерфейсу.

В CompetitionNew, введено вибір типу учасника з клавіатури (choice), замість хардкодування учасників. Це робить програму більш гнучкою і дозволяє користувачеві вибирати тип учасника під час виконання.

Додано закриття Scanner після його використання для запобігання витоку ресурсів.