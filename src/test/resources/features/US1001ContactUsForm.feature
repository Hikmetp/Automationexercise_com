Feature:US1001 Contact Us Form

  @contactUs
  Scenario: Contact Us Form

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then  'Bize Ulasin' dugmesine tiklayin
    Then  'GET IN TOUCH'un gorunur oldugunu dogrulayin
    Then  Adi, e-posta adresini, konuyu ve mesaji girin
    Then  Dosya yukle
    Then 'Gonder' dugmesini tiklayin
    Then  Tamam dugmesine tiklayin
    Then  Basari mesajini dogrulayin 'Success! Bilgileriniz basariyla gonderildi.' gorunur
    Then  'Ana Sayfa' dugmesini tiklayin ve ana sayfaya basariyla indigini dogrulayin

