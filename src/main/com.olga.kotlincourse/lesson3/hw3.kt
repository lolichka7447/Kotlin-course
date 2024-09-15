package com.olga.lesson3

import java.time.LocalDate

// Название мероприятия
const val eventName: String = "Meropriyatie"

class Hackathon {

    // Дата проведения
    var eventDate: LocalDate = LocalDate.of(2024, 9, 18)

    // Место проведения — изменяемая строка, может уточняться
    var eventLocation: String = "Sochi, Hotel Mercury, 17 level"

    // Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    var eventBudget: MutableMap<String, Double> = mutableMapOf(
        "Equipment" to 500000.0,
        "Catering" to 300000.0,
        "Miscellaneous" to 200000.0
    )

    // Количество участников — изменяемое число, с возможностью валидации
    var countApplaers: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    // Длительность хакатона — неизменяемая, обязательная для установки
    val eventDurationHours: Int = 8

    // Контактная информация с поставщиками — приватное неизменяемое поле, доступно только внутри класса
    private val supplierContacts: Map<String, String> = mapOf("Дядя Вова" to "8918842885")

    // Текущее состояние хакатона — изменяемое строковое поле
    var currentStatus: String = "Подготовка"

    // Список спонсоров — неизменяемый список строк
    val sponsorsList: List<String> = listOf("Магазин Открывашек", "Ресторан Рис", "Сбербанк")

    // Бюджет мероприятия — изменяемое поле для отслеживания текущего бюджета
    var currentBudget: Int = 250000

    // Уровень доступа к интернету — изменяемое значение, которое можно корректировать
    var internetAccessLevel: Int = 3

    // Информация о транспортировке — неизменяемое поле
    val transportationInfo: String = "Транспортировка оборудования запланирована на 17.09.2024"

    // Количество команд — изменяемое поле
    var teamsCount: Int = 10

    // Перечень задач — неизменяемое поле, список строк
    val tasksList: List<String> = listOf("Настройка оборудования", "Подготовка кейтеринга", "Организация регистрации")

    // План эвакуации — неизменяемое строковое поле
    val evacuationPlan: String = "Эвакуация через основные выходы, запасные двери указывают сотрудники"

    // Список доступного оборудования — изменяемое поле, список строк
    var availableEquipment: List<String> = listOf("Проекторы", "Ноутбуки", "Микрофоны")

    // Список свободного оборудования — изменяемое поле, зависит от текущего использования
    var freeEquipment: List<String> = listOf("Микрофоны")

    // График питания — изменяемое поле, может быть задано перед началом
    var foodSchedule: String? = null

    // План на случай сбоев — неизменяемое поле
    val contingencyPlan: String = "Запасной генератор на случай отключения электричества"

    // Список экспертов и жюри — неизменяемый список
    val judgesList: List<String> = listOf("Иван Иванов", "Мария Петрова", "Алексей Сидоров")

    // Методы и процедуры для сбора отзывов — неизменяемое поле
    val feedbackProcedures: String = "Анонимные анкеты через форму на сайте"

    // Политика конфиденциальности — неизменяемое поле
    val privacyPolicy: String = "Все данные участников защищены согласно политике конфиденциальности."

    // Приватные отзывы — изменяемое приватное поле, недоступное извне
    private var privateFeedback: List<String> = listOf()

    // Текущая температура — изменяемое поле
    var currentTemperature: Double = 22.5

    // Мониторинг сети — неизменяемое поле, структура данных для мониторинга
    val networkMonitoring: Map<String, String> = mapOf("Ping" to "Stable", "Speed" to "100 Mbps")

    // Уровень освещения — изменяемое поле
    var lightingLevel: Int = 75

    // Лог событий — изменяемое поле для хранения событий
    var eventLog: MutableList<String> = mutableListOf()

    // Доступность медпомощи — неизменяемое поле
    val medicalAidAvailable: Boolean = true

    // Планы по безопасности — неизменяемое поле
    val securityPlans: String = "План охраны разработан с учетом всех возможных угроз."

    // Регистрационный номер мероприятия — неизменяемое поле
    val registrationNumber: String = "HACK20240918"

    // Максимально допустимый уровень шума — неизменяемое значение
    val maxNoiseLevel: Int = 85

    // Индикатор превышения шума — изменяемое булево поле
    var noiseExceedIndicator: Boolean = false

    // Формат мероприятия — изменяемое поле
    var eventFormat: String = "Очный"

    // Количество свободных мест для отдыха — изменяемое поле с валидацией
    var availableSeats: Int = 50
        set(value) {
            if (value >= 0) field = value
        }

    // План взаимодействия с прессой — неизменяемое поле
    val pressPlan: String = "Пресс-конференция запланирована на финальный день."

    // Информация о проектах — неизменяемое поле, структура данных
    val projectDetails: Map<String, String> = mapOf("Проект 1" to "Сайт для хакатона", "Проект 2" to "Мобильное приложение")

    // Статус разрешений — изменяемое булево поле
    var permissionsStatus: Boolean = true

    // Доступ к эксклюзивным ресурсам — изменяемое булево поле
    var exclusiveResourcesAccess: Boolean = false

    // Список партнеров мероприятия — неизменяемое поле
    val partnersList: List<String> = listOf("Apple", "Google", "Microsoft")

    // Отчет мероприятия — изменяемое поле, генерируется после события
    var eventReport: String? = null

    // План распределения призов — неизменяемое поле
    val prizeDistributionPlan: String = "Награды будут распределены в конце мероприятия."

    // Контакты экстренных служб — приватное неизменяемое поле
    private val emergencyContacts: Map<String, String> = mapOf("Скорая помощь" to "103", "Полиция" to "102")

    // Особые условия для участников с ограниченными возможностями — неизменяемое поле
    val specialConditions: String = "Все участники с особыми потребностями будут обеспечены необходимой поддержкой."

    // Общее настроение участников — изменяемое поле, определяется опросами
    var participantsMood: String = "Отличное"

    // Подробный план хакатона — изменяемое поле, инициализируется перед началом
    var hackathonPlan: String? = null

    // Имя специального гостя — изменяемое поле, становится известным за день
    var specialGuestName: String? = null

    // Максимальная вместимость — неизменяемое поле
    val maxCapacity: Int = 300

    // Стандартное количество часов для работы — неизменяемое поле
    val standardWorkHours: Int = 48
}
