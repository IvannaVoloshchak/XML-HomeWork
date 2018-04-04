<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/xhtml" version="1.0">
    <xsl:output encoding="UTF-8" indent="yes" method="xml" standalone="no" omit-xml-declaration="no"/>
    <xsl:template match="touristVouchers">
        <html>

            <body>
                <h2>My Tourist Vouchers:</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Country</th>
                        <th>Type</th>
                        <th>Days</th>
                        <th>Nights</th>
                        <th>Transport</th>
                        <th>Stars</th>
                        <th>Beds</th>
                        <th>Conditioner</th>
                        <th>Food Type</th>
                        <th>TV</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="touristVoucher">
                        <xsl:sort select="hotelCharacteristics/stars"/>
                        <tr>
                            <td><xsl:value-of select="country" /></td>
                            <td><xsl:value-of select="voucherType" /></td>
                            <td><xsl:value-of select="numberDays" /></td>
                            <td><xsl:value-of select="numberNights" /></td>
                            <td><xsl:value-of select="transport" /></td>
                            <td><xsl:value-of select="hotelCharacteristics/stars" /></td>
                            <td><xsl:value-of select="hotelCharacteristics/bedCount" /></td>
                            <td><xsl:value-of select="hotelCharacteristics/conditionerPresent" /></td>
                            <td><xsl:value-of select="hotelCharacteristics/foodType" /></td>
                            <td><xsl:value-of select="hotelCharacteristics/TVPresent" /></td>
                            <td><xsl:value-of select="cost" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
