package zio.mail.client

final case class Credentials(
  username: String,
  password: String
)

final case class MailerSettings(
  host: Option[String] = None,
  port: Option[Int] = None,
  auth: Option[Boolean] = None,
  startTls: Option[Boolean] = None,
  ssl: Option[Boolean] = None,
  trustAll: Option[Boolean] = None,
  socketFactory: Option[String] = Some("javax.net.ssl.SSLSocketFactory"),
  socketFactoryPort: Option[String] = None,
  creds: Option[Credentials] = None
)
