package com.stripe.android

/**
 * See [Basic test card numbers](https://stripe.com/docs/testing#cards)
 */
internal object CardNumberFixtures {
    const val AMEX_NO_SPACES: String = "378282246310005"
    const val AMEX_WITH_SPACES: String = "3782 822463 10005"

    const val VISA_NO_SPACES: String = "4242424242424242"
    const val VISA_WITH_SPACES: String = "4242 4242 4242 4242"

    const val VISA_DEBIT_NO_SPACES: String = "4000056655665556"

    const val MASTERCARD_NO_SPACES = "5555555555554444"
    const val MASTERCARD_WITH_SPACES = "5555 5555 5555 4444"

    const val DINERS_CLUB_14_NO_SPACES: String = "36227206271667"
    const val DINERS_CLUB_14_WITH_SPACES: String = "3622 7206 2716 67"

    const val DINERS_CLUB_16_NO_SPACES = "3056930009020004"
    const val DINERS_CLUB_16_WITH_SPACES = "3056 9300 0902 0004"

    const val DISCOVER_NO_SPACES = "6011000990139424"
    const val DISCOVER_WITH_SPACES = "6011 0009 9013 9424"

    const val JCB_NO_SPACES = "3566002020360505"
    const val JCB_WITH_SPACES = "3566 0020 2036 0505"

    const val UNIONPAY_NO_SPACES = "6200000000000005"
    const val UNIONPAY_WITH_SPACES = "6200 0000 0000 0005"
}
