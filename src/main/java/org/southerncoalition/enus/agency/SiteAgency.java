package org.southerncoalition.enus.agency;

import java.util.List;

import org.southerncoalition.enus.cluster.Cluster;
import org.southerncoalition.enus.search.SearchList;
import org.southerncoalition.enus.state.SiteState;
import org.southerncoalition.enus.wrap.Wrap;

/**
 * Model: true
 * Api: true
 * Indexed: true
 * Saved: true
 * 
 * ApiTag.enUS: State
 * ApiUri.enUS: /api/agency
 * 
 * ApiMethod.enUS: PUTImport
 * ApiMethod.enUS: PUTMerge
 * ApiMethod.enUS: PUTCopy

 * ApiMethod: POST
 * ApiMethod: PATCH
 * ApiMethod: GET
 * ApiMethod.enUS: Search
 * 
 * ApiMethod.enUS: AdminSearch
 * ApiUriAdminSearch.enUS: /api/admin/agency
 * RoleUtilisateurAdminSearch.enUS: true
 * 
 * ApiMethod.enUS: SearchPage
 * PageSearchPage.enUS: SiteAgencyPage
 * PageSuperSearchPage.enUS: ClusterPage
 * ApiUriSearchPage.enUS: /agency
 * 
 * AName.enUS: a agency
 * Color: pale-yellow
 * IconGroup: regular
 * IconName: road
 * NameVar.enUS: agency
 * NamePlural.enUS: agencies
 * 
 * Role.frFR: SiteAdmin
 * Role.enUS: SiteAdmin
 * PublicRead: true
 * 
 * Sort.asc: agencyName
 * 
 * Lines: 100
 **/   
public class SiteAgency extends SiteAgencyGen<Cluster> {

	/**
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Description.enUS: The primary key of the agency in the database. 
	 */            
	protected void _agencyKey(Wrap<Long> c) {
		c.o(pk);
	}

	/**   
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Define: true
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * DisplayName.enUS: name
	 */ 
	protected void _agencyName(Wrap<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 */
	protected void _stateSearch(SearchList<SiteState> l) {
		l.setQuery("*:*");
		l.addFilterQuery("agencyKeys_indexed_longs:" + pk);
		l.setC(SiteState.class);
		l.setStore(true);
	}

	protected void _state_(Wrap<SiteState> c) {
		if(stateSearch.size() > 0) {
			c.o(stateSearch.get(0));
		}
	}

	/**  
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Attribute: SiteState.agencyKeys
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * DisplayName.enUS: state
	 */         
	protected void _stateKey(Wrap<Long> c) {
	}

	/**  
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Attribute: ReportCard.agencyKey
	 * HtmlRow: 4
	 * HtmlCell: 2
	 * DisplayName.enUS: report cards
	 */          
	protected void _reportCardKeys(List<Long> c) {
	}

	/**   
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 */ 
	protected void _stateId(Wrap<String> c) {
		if(state_ != null)
			c.o(state_.getObjectId());
	}

	/**   
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 */ 
	protected void _stateName(Wrap<String> c) {
		if(state_ != null)
			c.o(state_.getStateName());
	}

	/**   
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 */ 
	protected void _stateAbbreviation(Wrap<String> c) {
		if(state_ != null)
			c.o(state_.getStateAbbreviation());
	}

	/**   
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * VarH2: true
	 * VarTitle: true
	 */ 
	protected void _agencyCompleteName(Wrap<String> c) {
		c.o(agencyName + " agency in " + stateName + " (" + stateAbbreviation + ")");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override() protected void  _objectTitle(Wrap<String> c) {
		c.o(agencyName + " agency in " + stateName + " (" + stateAbbreviation + ")");
	}
}