<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE releve SYSTEM "releve.dtd">
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <body>
                <h1 style="text-align: center;color: blue;">Relve Bancaire</h1>
                <div>
                    <ul>
                        <li>RIB: <xsl:value-of select="releve/@RIB"/></li>
                        <li>dateReleve: &dateReleve;</li>
                        <li>Solde: &solde;</li>
                    </ul>
                    <h3>Les opérations effectuent de 
                        <xsl:value-of select="releve/operations/@dateDebut"/>
                        <xsl:value-of select="releve/operations/@dateFin"/>
                    </h3>
                    <table border="1" width="80%">
                        <thead>
                            <tr>
                                <th>Type</th>
                                <th>Date d'operation</th>
                                <th>Montant</th>
                                <th>Description</th>
                            </tr>
                        </thead>
                        <tbody>
                            <xsl:for-each select="releve/operations/operation[@type='CREDIT']">
                                <tr>
                                    <td><xsl:value-of select="@type"/></td>
                                    <td><xsl:value-of select="@date"/></td>
                                    <td><xsl:value-of select="@montant"/></td>
                                    <td><xsl:value-of select="@description"/></td>
                                </tr>
                            </xsl:for-each>
                        </tbody>
                    </table>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>