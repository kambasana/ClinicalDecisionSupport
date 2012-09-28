/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.hhs.fha.nhinc.displayalertdata;

import gov.hhs.fha.nhinc.common.dda.GetComponentDetailDataForUserRequestType;
import gov.hhs.fha.nhinc.common.dda.GetDataSourceNameRequestType;
import gov.hhs.fha.nhinc.common.dda.GetDataSourceNameResponseType;
import gov.hhs.fha.nhinc.common.dda.GetComponentDetailDataResponseType;
import gov.hhs.fha.nhinc.common.dda.GetComponentSummaryDataForUserRequestType;
import gov.hhs.fha.nhinc.common.dda.GetComponentSummaryDataResponseType;
import gov.hhs.fha.nhinc.common.dda.GetMessagesRequestType;
import gov.hhs.fha.nhinc.common.dda.GetMessagesResponseType;
import gov.hhs.fha.nhinc.common.dda.SetMessageRequestType;
import gov.hhs.fha.nhinc.common.dda.SetMessageResponseType;
import gov.hhs.fha.nhinc.common.dda.UpdateComponentInboxStatusRequestType;
import gov.hhs.fha.nhinc.common.dda.UpdateComponentInboxStatusResponseType;
import gov.hhs.fha.nhinc.displayalert.DisplayAlertDataUtil;

/**
 *
 * @author Sushma
 */
public class DisplayAlertDataImpl {

    /**
     * Retrieve data source name.
     *
     * @param getDataSourceNameRequest
     * @return
     */
    public GetDataSourceNameResponseType getDataSourceName(GetDataSourceNameRequestType getDataSourceNameRequest) {
        GetDataSourceNameResponseType response = new GetDataSourceNameResponseType();
        response.setReturn(DisplayAlertDataUtil.DATA_SOURCE_ALERTS);

        return response;
    }

    /**
     * Update Inbox status.
     *
     * @param request
     * @return
     */
    public UpdateComponentInboxStatusResponseType updateComponentInboxStatus(UpdateComponentInboxStatusRequestType request) {
        return new DisplayAlertDataUtil().updateComponentInboxStatus(DisplayAlertDataUtil.DATA_SOURCE_ALERTS, request);
    }

    /**
     * Retrieve detail data.
     *
     * @param request
     * @return
     */
    public GetComponentDetailDataResponseType getComponentDetailDataForUser(GetComponentDetailDataForUserRequestType request) {
        return new DisplayAlertDataUtil().getComponentDetailDataForUser(DisplayAlertDataUtil.DATA_SOURCE_ALERTS, request);
    }

    /**
     * Retreive summary objects for all alerts.
     *
     * @param request
     * @return
     */
    public GetComponentSummaryDataResponseType getComponentSummaryDataForUser(GetComponentSummaryDataForUserRequestType request) {
        return new DisplayAlertDataUtil().getComponentSummaryDataForUser(DisplayAlertDataUtil.DATA_SOURCE_ALERTS, request);
    }

    /**
     * Retreive summary objects for all alerts.
     *
     * @param request
     * @return
     */
    public SetMessageResponseType setMessage(SetMessageRequestType request) {
        return new DisplayAlertDataUtil().setMessage(DisplayAlertDataUtil.DATA_SOURCE_ALERTS, request);
    }

    public GetMessagesResponseType getMessages(GetMessagesRequestType request) {
        return new DisplayAlertDataUtil().getMessages(DisplayAlertDataUtil.DATA_SOURCE_ALERTS, request);
    }

}

